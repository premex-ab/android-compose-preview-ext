package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WALTON device specifications for Android Compose previews.
 *
 * This extension provides WALTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WALTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WALTON: Any
  get() = object {
      /** DeviceSpec(manufacturer=WALTON, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=IAD, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=IAD, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WALTON, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WALTON, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N25, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N25, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NEXG_N25 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N26, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N26, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val NEXG_N26 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N27, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N27, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEXG_N27 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N71, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N71, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NEXG_N71 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N71_Plus, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N71_Plus,
      width=720, height=1612, dpi=280, isGoogleDevice=false).code */
      val NEXG_N71_PLUS = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N72, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N72, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NEXG_N72 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N73, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N73, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEXG_N73 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N74, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N74, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val NEXG_N74 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val NEXG_N8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=NEXG_N9, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=NEXG_N9, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NEXG_N9 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=OrbitY20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=OrbitY20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ORBITY20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Orbit_Y11, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Orbit_Y11, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ORBIT_Y11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=ORBIT_Y12, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=ORBIT_Y12, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ORBIT_Y12 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=ORBIT_Y13, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=ORBIT_Y13, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ORBIT_Y13 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=ORBIT_Y70, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=ORBIT_Y70, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val ORBIT_Y70 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_D10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_D10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_D10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_D9, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_D9, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PRIMO_D9 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_E10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_E10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_E10_Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_E10_Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E10_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_E11, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_E11, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_E12, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_E12, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_E8s, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_E8s, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E8S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_E9, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_E9, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_E9 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_EF10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_EF10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_EF10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_EF7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_EF7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_EF7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_EF8_4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_EF8_4G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_EF8_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_EF9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_EF9, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_EF9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_EM2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_EM2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_EM2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_F10, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_F10, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_F10 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_F8, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_F8, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_F8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_F8s, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_F8s, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_F8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_F9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_F9, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_F9 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_G9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_G9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_G9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GF6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GF6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GF6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GH10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GH10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GH10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GH7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GH7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GH7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GH7i, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GH7i, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GH7I = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GH8, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GH8, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GH8 = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GH9, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GH9, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GH9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GM3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GM3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GM3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GM3_plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GM3_plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_GM3_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_GM4, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_GM4, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_GM4 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_H10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_H10, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_H10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_H8_Pro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_H8_Pro,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val PRIMO_H8_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_H9, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_H9, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_H9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_H9_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_H9_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_H9_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_HM5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_HM5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_HM5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_HM6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_HM6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_HM6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_HM7, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_HM7, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val PRIMO_HM7 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_N4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_N4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_N4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_N5, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_N5, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val PRIMO_N5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_NF4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_NF4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_NF4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_NF4_2GB, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_NF4_2GB,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_NF4_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_NF5, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_NF5, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val PRIMO_NF5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_NH3i, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_NH3i, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_NH3I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_NH4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_NH4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_NH4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_NH5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_NH5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PRIMO_NH5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_NX6, width=1440, height=3040, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_NX6, width=1440,
      height=3040, dpi=560, isGoogleDevice=false).code */
      val PRIMO_NX6 = "spec:width=1440,height=3040,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R4_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R4_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R4_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R5_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R5_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R5_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R6_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R6_Max,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R6_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_R9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_R9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_R9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_RM3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_RM3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_RM3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_RM4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_RM4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_RM4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_RX7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_RX7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PRIMO_RX7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_RX8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_RX8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_RX8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_RX8_Mini, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_RX8_Mini,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val PRIMO_RX8_MINI = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_RX9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_RX9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PRIMO_RX9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_S6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_S6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PRIMO_S6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_S6_Dual, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_S6_Dual,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_S6_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_S6_infinity, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_S6_infinity,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PRIMO_S6_INFINITY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_S7, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_S7, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val PRIMO_S7 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_S7_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_S7_Pro,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val PRIMO_S7_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_S8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_S8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val PRIMO_S8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_X5, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_X5, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PRIMO_X5 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=Primo_ZX3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Primo_ZX3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PRIMO_ZX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=PRIMO_ZX4, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=PRIMO_ZX4, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val PRIMO_ZX4 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=RX7_Mini, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=RX7_Mini, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RX7_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WALTON, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WALTON, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WALTON, code=WALPAD8G_V2, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=WALPAD8G_V2,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val WALPAD8G_V2 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=WALTON, code=Walpad_10H, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=Walpad_10H,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val WALPAD_10H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=WALPAD_10H_Pro, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=WALPAD_10H_Pro,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val WALPAD_10H_PRO = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WALTON, code=WALPAD_8G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=WALPAD_8G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WALPAD_8G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=WALTON, code=WBW5616WA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=WBW5616WA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WBW5616WA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=XANON_X20, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=XANON_X20, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val XANON_X20 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=XANON_X21, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=XANON_X21, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val XANON_X21 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=XANON_X90, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=XANON_X90, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val XANON_X90 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=XANON_X91, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=XANON_X91, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val XANON_X91 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WALTON, code=ZENX_1, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=ZENX_1, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val ZENX_1 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=zenx_2, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=zenx_2, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val ZENX_2 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WALTON, code=10P, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WALTON, code=10P, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val _10P = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
