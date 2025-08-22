package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hitachi device specifications for Android Compose previews.
 *
 * This extension provides Hitachi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hitachi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hitachi: Any
  get() = object {
      /** Hitachi bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hitachi komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hitachi samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
