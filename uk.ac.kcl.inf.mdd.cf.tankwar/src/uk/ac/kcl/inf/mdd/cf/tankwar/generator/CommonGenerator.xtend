/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.generator


import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification

/**
 * Common generator bits.
 */
class CommonGenerator {
	protected ModelPreprocessor mpp
	protected val TankWarGame twg

	new(ModelPreprocessor mpp) {
		this.mpp = mpp
		twg = mpp.getTankWarGame
	}

	def generateViewPackage() '''«twg.name».view'''

	def generateViewPackageFolder() '''«twg.name»/view'''

	def generateModelPackage() '''«twg.name».model'''

	def generateModelPackageFolder() '''«twg.name»/model'''



	def generateFrameClassName() '''TankClient'''
	
	def generateTankClassName() '''Tank'''
	
	def generateWallClassName() '''Wall'''
	
	def generateMissileClassName() '''Missile'''

	def generateExplodeClassName() '''Explode'''

	def generateFieldClassName() '''«twg.name.toFirstUpper»Field'''

	def generateFieldClassFileName() '''«generateModelPackageFolder»/«generateFieldClassName()».java'''



	def generateFieldInitialiserName(FieldSpecification f) '''initialise«f.name.toFirstUpper»Field'''



	def generateFrameClassFileName() '''«generateViewPackageFolder»/«generateFrameClassName()».java'''

	def generateTankClassFileName() '''«generateViewPackageFolder»/«generateTankClassName()».java'''

	def generateWallClassFileName() '''«generateViewPackageFolder»/«generateWallClassName()».java'''

	def generateMissileClassFileName() '''«generateViewPackageFolder»/«generateMissileClassName()».java'''

	def generateExplodeClassFileName() '''«generateViewPackageFolder»/«generateExplodeClassName()».java'''
	
	
	
}
