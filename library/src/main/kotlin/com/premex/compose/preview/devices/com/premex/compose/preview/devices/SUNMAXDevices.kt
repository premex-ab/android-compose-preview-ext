package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNMAX device specifications for Android Compose previews.
 *
 * This extension provides SUNMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNMAX, code=Model_3, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_3, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MODEL_3 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val MODEL_6 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6_4G, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6_4G, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val MODEL_6_4G = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MODEL_6_PRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6_pro_4G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6_pro_4G,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MODEL_6_PRO_4G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro_Max, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro_Max,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val MODEL_6_PRO_MAX = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro_Max_4G, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_6_Pro_Max_4G,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val MODEL_6_PRO_MAX_4G = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_D, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_D, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val MODEL_D = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_E, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_E, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MODEL_E = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_E_4G, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_E_4G, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MODEL_E_4G = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_One, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_One, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MODEL_ONE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_S, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_S, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val MODEL_S = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_S_4G, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_S_4G, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val MODEL_S_4G = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_T, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_T, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MODEL_T = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_T1, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_T1, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val MODEL_T1 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_T2, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_T2, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val MODEL_T2 = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_X, width=480, height=1014, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_X, width=480,
      height=1014, dpi=180, isGoogleDevice=false).code */
      val MODEL_X = "spec:width=480,height=1014,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_X_4G_A, width=480, height=1014, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_X_4G_A,
      width=480, height=1014, dpi=180, isGoogleDevice=false).code */
      val MODEL_X_4G_A = "spec:width=480,height=1014,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SUNMAX, code=Model_Y, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Model_Y, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MODEL_Y = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNMAX, code=Sunmax_Model_Tab_10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Sunmax_Model_Tab_10,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val SUNMAX_MODEL_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SUNMAX, code=Tab_6, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNMAX, code=Tab_6, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val TAB_6 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
