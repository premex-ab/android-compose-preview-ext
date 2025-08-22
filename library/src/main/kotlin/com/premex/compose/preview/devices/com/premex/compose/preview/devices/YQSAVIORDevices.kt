package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YQSAVIOR device specifications for Android Compose previews.
 *
 * This extension provides YQSAVIOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YQSAVIOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YQSAVIOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=YQSAVIOR, code=Q2K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YQSAVIOR, code=Q2K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q2K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YQSAVIOR, code=YQ10S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YQSAVIOR, code=YQ10S, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val YQ10S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
