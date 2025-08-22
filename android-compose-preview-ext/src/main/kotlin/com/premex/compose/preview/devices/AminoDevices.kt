package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amino device specifications for Android Compose previews.
 *
 * This extension provides Amino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amino: Any
  get() = object {
      /** Amino Amigo */
      val AMIGO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7x */
      val AMIGO7X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7x3SBC */
      val AMIGO7X3SBC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7xcCN */
      val AMIGO7XCCN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7xESP */
      val AMIGO7XESP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7xGM */
      val AMIGO7XGM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7xSCB */
      val AMIGO7XSCB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Amino Amigo7Y */
      val AMIGO7Y = "spec:width=480,height=720,unit=px,dpi=320"

  }
