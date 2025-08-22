package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARBOR device specifications for Android Compose previews.
 *
 * This extension provides ARBOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARBOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARBOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARBOR, code=G47, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARBOR, code=G47, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G47 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARBOR, code=GT78-VN, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARBOR, code=GT78-VN, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GT78_VN = "spec:width=800,height=1280,unit=px,dpi=240"

  }
