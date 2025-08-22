package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ChunghwaTelecom device specifications for Android Compose previews.
 *
 * This extension provides ChunghwaTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ChunghwaTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ChunghwaTelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=ChunghwaTelecom, code=HamiVideo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ChunghwaTelecom, code=HamiVideo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HAMIVIDEO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
