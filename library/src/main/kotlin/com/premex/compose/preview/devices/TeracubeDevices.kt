package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Teracube device specifications for Android Compose previews.
 *
 * This extension provides Teracube device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teracube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teracube: Any
  get() = object {
      /** Teracube sapphire */
      val SAPPHIRE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Teracube Teracube_2e */
      val TERACUBE_2E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Teracube Teracube_One */
      val TERACUBE_ONE = "spec:width=1080,height=2280,unit=px,dpi=480"

  }
