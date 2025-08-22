package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Element device specifications for Android Compose previews.
 *
 * This extension provides Element device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Element.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Element: Any
  get() = object {
      /** Element kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Element tennoji */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Element Tiger838 */
      val TIGER838 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
