package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AND device specifications for Android Compose previews.
 *
 * This extension provides AND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AND: Any
  get() = object {
      /** DeviceSpec(manufacturer=AND, code=HS8916QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AND, code=HS8916QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
