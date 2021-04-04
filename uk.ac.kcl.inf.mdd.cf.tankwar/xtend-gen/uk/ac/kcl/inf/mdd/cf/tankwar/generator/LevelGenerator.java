package uk.ac.kcl.inf.mdd.cf.tankwar.generator;

import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.mdd.cf.tankwar.generator.CommonGenerator;
import uk.ac.kcl.inf.mdd.cf.tankwar.generator.ModelPreprocessor;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ObstacleMember;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle;

@SuppressWarnings("all")
public class LevelGenerator extends CommonGenerator {
  public LevelGenerator(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateAbsLevelClassFileName = this.generateAbsLevelClassFileName();
    _builder.append(_generateAbsLevelClassFileName);
    fsa.generateFile(_builder.toString(), this.generateAbsLevelClass());
    final Consumer<FieldSpecification> _function = (FieldSpecification l) -> {
      StringConcatenation _builder_1 = new StringConcatenation();
      CharSequence _generateLevelClassFileName = this.generateLevelClassFileName(l.getName());
      _builder_1.append(_generateLevelClassFileName);
      fsa.generateFile(_builder_1.toString(), this.generateLevelClass(l));
    };
    this.twg.getFields().forEach(_function);
  }
  
  public CharSequence generateLevelClass(final FieldSpecification f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateLevelPackage = this.generateLevelPackage();
    _builder.append(_generateLevelPackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateViewPackage = this.generateViewPackage();
    _builder.append(_generateViewPackage);
    _builder.append(".");
    CharSequence _generateTankClassName = this.generateTankClassName();
    _builder.append(_generateTankClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateViewPackage_1 = this.generateViewPackage();
    _builder.append(_generateViewPackage_1);
    _builder.append(".");
    CharSequence _generateFrameClassName = this.generateFrameClassName();
    _builder.append(_generateFrameClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateViewPackage_2 = this.generateViewPackage();
    _builder.append(_generateViewPackage_2);
    _builder.append(".");
    CharSequence _generateWallClassName = this.generateWallClassName();
    _builder.append(_generateWallClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Created by tyr on 2021/3/23.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _generateLevelClassName = this.generateLevelClassName(f.getName());
    _builder.append(_generateLevelClassName);
    _builder.append(" extends Level {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    CharSequence _generateLevelClassName_1 = this.generateLevelClassName(f.getName());
    _builder.append(_generateLevelClassName_1, "    ");
    _builder.append("(");
    CharSequence _generateFrameClassName_1 = this.generateFrameClassName();
    _builder.append(_generateFrameClassName_1, "    ");
    _builder.append(" tankClient){");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("this.tankClient = tankClient;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    CharSequence _generateWallClassName_1 = this.generateWallClassName();
    _builder.append(_generateWallClassName_1, "    ");
    _builder.append("> getWalls() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("walls = new ArrayList<>();");
    _builder.newLine();
    _builder.append("       \t");
    final Function1<ObstacleMember, CharSequence> _function = (ObstacleMember obstacle) -> {
      return this.generateObstacleFieldInitialiserFor(obstacle);
    };
    String _join = IterableExtensions.<ObstacleMember>join(f.getObstacle().getFields(), "", _function);
    _builder.append(_join, "       \t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return walls;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public List<");
    CharSequence _generateTankClassName_1 = this.generateTankClassName();
    _builder.append(_generateTankClassName_1, "    ");
    _builder.append("> getTanks() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("tanks = new ArrayList<>();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for(int i =0;i<getEnemyNum();i++){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("tanks.add(new ");
    CharSequence _generateTankClassName_2 = this.generateTankClassName();
    _builder.append(_generateTankClassName_2, "            ");
    _builder.append("(50+40*(i+1),50,false,");
    CharSequence _generateTankClassName_3 = this.generateTankClassName();
    _builder.append(_generateTankClassName_3, "            ");
    _builder.append(".Direction.D,tankClient));");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return tanks;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    CharSequence _generateAbsLevelClassName = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName, "    ");
    _builder.append(" getNextLevel() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return new ");
    CharSequence _generateLevelClassName_2 = this.generateLevelClassName(f.getNextLevel().getName());
    _builder.append(_generateLevelClassName_2, "        ");
    _builder.append("(tankClient);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    CharSequence _generateAbsLevelClassName_1 = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName_1, "    ");
    _builder.append(" getCurrentLevel() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return this;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public int getEnemyNum() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    int _intValue = this.evaluate(f.getEnemyCount()).intValue();
    _builder.append(_intValue, "        ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAbsLevelClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateLevelPackage = this.generateLevelPackage();
    _builder.append(_generateLevelPackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateViewPackage = this.generateViewPackage();
    _builder.append(_generateViewPackage);
    _builder.append(".");
    CharSequence _generateTankClassName = this.generateTankClassName();
    _builder.append(_generateTankClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateViewPackage_1 = this.generateViewPackage();
    _builder.append(_generateViewPackage_1);
    _builder.append(".");
    CharSequence _generateFrameClassName = this.generateFrameClassName();
    _builder.append(_generateFrameClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateViewPackage_2 = this.generateViewPackage();
    _builder.append(_generateViewPackage_2);
    _builder.append(".");
    CharSequence _generateWallClassName = this.generateWallClassName();
    _builder.append(_generateWallClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Created by tyr on 2021/3/23.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public abstract class ");
    CharSequence _generateAbsLevelClassName = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    CharSequence _generateAbsLevelClassName_1 = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName_1, "    ");
    _builder.append(" nextLevel;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected List<");
    CharSequence _generateWallClassName_1 = this.generateWallClassName();
    _builder.append(_generateWallClassName_1, "    ");
    _builder.append("> walls;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected List<");
    CharSequence _generateTankClassName_1 = this.generateTankClassName();
    _builder.append(_generateTankClassName_1, "    ");
    _builder.append("> tanks;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected int enemyNum;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    CharSequence _generateFrameClassName_1 = this.generateFrameClassName();
    _builder.append(_generateFrameClassName_1, "    ");
    _builder.append(" tankClient;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public abstract List<");
    CharSequence _generateWallClassName_2 = this.generateWallClassName();
    _builder.append(_generateWallClassName_2, "    ");
    _builder.append("> getWalls();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public abstract List<");
    CharSequence _generateTankClassName_2 = this.generateTankClassName();
    _builder.append(_generateTankClassName_2, "    ");
    _builder.append("> getTanks();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public abstract ");
    CharSequence _generateAbsLevelClassName_2 = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName_2, "    ");
    _builder.append(" getNextLevel();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public abstract ");
    CharSequence _generateAbsLevelClassName_3 = this.generateAbsLevelClassName();
    _builder.append(_generateAbsLevelClassName_3, "    ");
    _builder.append(" getCurrentLevel();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public abstract int getEnemyNum();");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateObstacleFieldInitialiserFor(final ObstacleMember member) {
    CharSequence _xifexpression = null;
    if ((member instanceof WallObstacle)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("walls.add(new ");
      CharSequence _generateWallClassName = this.generateWallClassName();
      _builder.append(_generateWallClassName);
      _builder.append("(");
      int _wallPosX = ((WallObstacle)member).getWallPosX();
      _builder.append(_wallPosX);
      _builder.append(",");
      int _wallPosY = ((WallObstacle)member).getWallPosY();
      _builder.append(_wallPosY);
      _builder.append(",");
      int _wallWidth = ((WallObstacle)member).getWallWidth();
      _builder.append(_wallWidth);
      _builder.append(",");
      int _wallHeight = ((WallObstacle)member).getWallHeight();
      _builder.append(_wallHeight);
      _builder.append(",tankClient));");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
}
