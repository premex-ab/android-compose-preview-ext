package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HANNspree device specifications for Android Compose previews.
 *
 * This extension provides HANNspree device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HANNspree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HANNspree: Any
  get() = object {
      /** DeviceSpec(manufacturer=HANNspree, code=HSG1351, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HANNspree, code=HSG1351,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val HSG1351 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HANNspree, code=HSG1416A, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HANNspree, code=HSG1416A,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val HSG1416A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HANNspree, code=Reader, width=1200, height=1600, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HANNspree, code=Reader, width=1200,
      height=1600, dpi=213, isGoogleDevice=false).code */
      val READER = "spec:width=1200,height=1600,unit=px,dpi=213"

  }
