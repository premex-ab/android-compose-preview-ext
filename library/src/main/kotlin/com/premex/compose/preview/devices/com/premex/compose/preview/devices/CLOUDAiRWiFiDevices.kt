package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLOUD_AiR-WiFi device specifications for Android Compose previews.
 *
 * This extension provides CLOUD_AiR-WiFi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLOUDAiRWiFi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLOUDAiRWiFi: Any
  get() = object {
      /** DeviceSpec(manufacturer=CLOUD_AiR-WiFi, code=ATab-1, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CLOUD_AiR-WiFi, code=ATab-1,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ATAB_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
