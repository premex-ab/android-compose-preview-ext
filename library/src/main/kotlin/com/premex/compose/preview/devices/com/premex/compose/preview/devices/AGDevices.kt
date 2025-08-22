package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AG device specifications for Android Compose previews.
 *
 * This extension provides AG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AG: Any
  get() = object {
      /** DeviceSpec(manufacturer=AG, code=Hashtag, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AG, code=Hashtag, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HASHTAG = "spec:width=720,height=1280,unit=px,dpi=320"

  }
