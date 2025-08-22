package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Infiniton device specifications for Android Compose previews.
 *
 * This extension provides Infiniton device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infiniton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infiniton: Any
  get() = object {
      /** Infiniton bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Infiniton bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Infiniton komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Infiniton shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
