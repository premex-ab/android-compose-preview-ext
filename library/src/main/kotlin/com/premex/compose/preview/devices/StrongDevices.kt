package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Strong device specifications for Android Compose previews.
 *
 * This extension provides Strong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Strong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Strong: Any
  get() = object {
      /** Strong bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Strong LAS */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong RMQ */
      val RMQ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong YYC */
      val YYC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong YYT */
      val YYT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Strong ZRH */
      val ZRH = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
