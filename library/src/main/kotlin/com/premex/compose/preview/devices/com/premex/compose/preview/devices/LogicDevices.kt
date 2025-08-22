package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Logic device specifications for Android Compose previews.
 *
 * This extension provides Logic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Logic, code=L55A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logic, code=L55A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Logic, code=Logic_L57, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logic, code=Logic_L57, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LOGIC_L57 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Logic, code=MTK9679, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logic, code=MTK9679, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val MTK9679 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Logic, code=rk3576_u, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logic, code=rk3576_u, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RK3576_U = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Logic, code=X4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logic, code=X4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X4 = "spec:width=480,height=800,unit=px,dpi=240"

  }
