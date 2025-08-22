package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hisense device specifications for Android Compose previews.
 *
 * This extension provides Hisense device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hisense.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hisense: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hisense, code=changjiang, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=changjiang,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val CHANGJIANG = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=hamamatsucho,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=harajuku, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=harajuku, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HARAJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=helium3, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=helium3, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HELIUM3 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=hengshan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=hengshan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=hirano, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=hirano, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HIRANO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_11, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_11,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_11 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_12, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_12,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_14, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_14,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_14 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_20, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_20,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_20 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_21, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_21,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_21 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE100E_22, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE100E_22,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE100E_22 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_20,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_22, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_22,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_22 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_24, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_24,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_24 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_30, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_30,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_30 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_31, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_31,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_31 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_32, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_32,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_32 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_33, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_33,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_33 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_40, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_40,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_40 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE103E_41, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE103E_41,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val HLTE103E_41 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE105E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE105E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE105E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE105E_02, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE105E_02,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE105E_02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE105E_03, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE105E_03,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE105E_03 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE106E_01, width=480, height=1010, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE106E_01,
      width=480, height=1010, dpi=240, isGoogleDevice=false).code */
      val HLTE106E_01 = "spec:width=480,height=1010,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE106E_30, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE106E_30,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE106E_30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE106E_31, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE106E_31,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE106E_31 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE106E_40, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE106E_40,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE106E_40 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE106E_41, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE106E_41,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val HLTE106E_41 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE109E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE109E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE109E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE109E_01, width=540, height=1092, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE109E_01,
      width=540, height=1092, dpi=240, isGoogleDevice=false).code */
      val HLTE109E_01 = "spec:width=540,height=1092,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE109E_02, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE109E_02,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val HLTE109E_02 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE109E_03, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE109E_03,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val HLTE109E_03 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE120E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE120E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HLTE120E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE120E_01, width=720, height=1552, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE120E_01,
      width=720, height=1552, dpi=272, isGoogleDevice=false).code */
      val HLTE120E_01 = "spec:width=720,height=1552,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE121E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE121E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE121E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE202N, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE202N, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val HLTE202N = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE203T, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE203T, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HLTE203T = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE222E, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE222E, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val HLTE222E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE222E_01, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE222E_01,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val HLTE222E_01 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE226E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE226E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE226E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_02, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_02,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_10,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_11,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_12,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_14, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_14,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_14 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_20,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE228E_22, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE228E_22,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE228E_22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E_10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E_10,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E_11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E_11,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E_12,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE229E_30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE229E_30,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE229E_30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE230E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE230E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE230E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE230E_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE230E_20,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE230E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE232E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE232E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE232E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE232E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE232E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE232E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE232E_10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE232E_10,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE232E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE232E_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE232E_12,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE232E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE232E_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE232E_20,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE232E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE233E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE233E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE233E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE233E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE233E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE233E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE233E_10, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE233E_10,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE233E_10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE233E_11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE233E_11,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE233E_11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE234E, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE234E, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val HLTE234E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE235E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE235E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE235E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE235E_12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE235E_12,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE235E_12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE235E_20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE235E_20,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE235E_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE240E, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE240E, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val HLTE240E = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE243E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE243E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE243E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE243E_01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE243E_01,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE243E_01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE262E, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE262E, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val HLTE262E = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE262E_01, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE262E_01,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val HLTE262E_01 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE263E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE263E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HLTE263E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE315E, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE315E, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val HLTE315E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE321E, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE321E, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val HLTE321E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE322E, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE322E, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val HLTE322E = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HLTE730T, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HLTE730T, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val HLTE730T = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HNR500E, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HNR500E, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val HNR500E = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HNR500E_02, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HNR500E_02,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val HNR500E_02 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HNR500E_03, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HNR500E_03,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val HNR500E_03 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HNR510E, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HNR510E, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val HNR510E = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HS6580MT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS6580MT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HS6580MT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HS6735MT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS6735MT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS6735MT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS6737MT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS6737MT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS6737MT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS6739MT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS6739MT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HS6739MT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HS6763MT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS6763MT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS6763MT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS7331CSC, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS7331CSC, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HS7331CSC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HS7731CSP, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS7731CSP, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HS7731CSP = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hisense, code=HS7731SP, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS7731SP, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS7731SP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8909QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8909QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8909QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8916QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8916QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8917QC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8917QC, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS8917QC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8929QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8929QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8929QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8937QC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8937QC, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HS8937QC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HS8953QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HS8953QC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HS8953QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=HSSC9850, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HSSC9850, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HSSC9850 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=HSSDM450QC, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=HSSDM450QC,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val HSSDM450QC = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=huaihe, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=huaihe, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val HUAIHE = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=huanghe, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=huanghe, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val HUANGHE = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Hisense, code=huangshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=huangshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=laohushan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=laohushan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOHUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=laoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=laoshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=lushan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=lushan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=m470, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=m470, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M470 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hisense, code=moeraki, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=moeraki, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MOERAKI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=rk3028a, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=rk3028a, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val RK3028A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hisense, code=rk3288, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=rk3288, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val RK3288 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=SC9832E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=SC9832E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SC9832E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=SC9863A, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=SC9863A, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SC9863A = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=SC9863A_RU, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=SC9863A_RU,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val SC9863A_RU = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=songshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=taishan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=taishan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TAISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=vision2_1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=vision2_1,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VISION2_1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=vision2_5, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=vision2_5,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VISION2_5 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=wutaishan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=wutaishan,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val WUTAISHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=wuyishan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=wuyishan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WUYISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=xiaoyushan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=xiaoyushan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hisense, code=xinhaoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hisense, code=xinhaoshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val XINHAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
