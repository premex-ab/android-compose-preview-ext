package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZZB device specifications for Android Compose previews.
 *
 * This extension provides ZZB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZZB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZZB: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZZB, code=ZB10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZZB, code=ZB10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ZB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZZB, code=ZB10M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZZB, code=ZB10M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZB10M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZZB, code=ZB40, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZZB, code=ZB40, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZB40 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
