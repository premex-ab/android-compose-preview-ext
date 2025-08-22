package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * humaxdigital device specifications for Android Compose previews.
 *
 * This extension provides humaxdigital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Humaxdigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Humaxdigital: Any
  get() = object {
      /** humaxdigital b604tnw */
      val B604TNW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** humaxdigital fvp4kgtr */
      val FVP4KGTR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** humaxdigital h5mini */
      val H5MINI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** humaxdigital vision */
      val VISION = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
