package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dreamstar device specifications for Android Compose previews.
 *
 * This extension provides Dreamstar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dreamstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dreamstar: Any
  get() = object {
      /** Dreamstar marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dreamstar nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Dreamstar YYZ */
      val YYZ = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
