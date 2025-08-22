package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARCELIK device specifications for Android Compose previews.
 *
 * This extension provides ARCELIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARCELIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARCELIK: Any
  get() = object {
      /** ARCELIK akropoli */
      val AKROPOLI = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ARCELIK kunyang */
      val KUNYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARCELIK R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARCELIK sinchon */
      val SINCHON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARCELIK wanchai */
      val WANCHAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
