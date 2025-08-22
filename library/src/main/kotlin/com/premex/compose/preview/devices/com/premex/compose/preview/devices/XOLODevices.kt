package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XOLO device specifications for Android Compose previews.
 *
 * This extension provides XOLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XOLO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XOLO: Any
  get() = object {
      /** DeviceSpec(manufacturer=XOLO, code=XE2X, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XOLO, code=XE2X, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XE2X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XOLO, code=XE2X3GB, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XOLO, code=XE2X3GB, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XE2X3GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XOLO, code=XOLO_era_4K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XOLO, code=XOLO_era_4K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XOLO_ERA_4K = "spec:width=720,height=1280,unit=px,dpi=320"

  }
