package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LP device specifications for Android Compose previews.
 *
 * This extension provides LP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LP: Any
  get() = object {
      /** DeviceSpec(manufacturer=LP, code=LP_Legend, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_Legend, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LP_LEGEND = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LP, code=LP_N60, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_N60, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val LP_N60 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LP, code=LP_N_50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_N_50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LP_N_50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=LP_N_57, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_N_57, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LP_N_57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=LP_Pro1, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_Pro1, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LP_PRO1 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=LP_T70, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_T70, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val LP_T70 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LP, code=LP_T70_Lite, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_T70_Lite, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val LP_T70_LITE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LP, code=LP_Vyper, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=LP_Vyper, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LP_VYPER = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=N60, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=N60, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=N-57, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=N-57, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N_57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=N-57-Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=N-57-Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N_57_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=N-60, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=N-60, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val N_60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=T100, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=T100, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LP, code=Vyper_PRO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=Vyper_PRO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VYPER_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LP, code=W55, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LP, code=W55, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val W55 = "spec:width=480,height=960,unit=px,dpi=213"

  }
