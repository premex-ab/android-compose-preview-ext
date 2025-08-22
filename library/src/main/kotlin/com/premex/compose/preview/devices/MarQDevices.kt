package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MarQ device specifications for Android Compose previews.
 *
 * This extension provides MarQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MarQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MarQ: Any
  get() = object {
      /** MarQ bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MarQ GIONEE_MAX */
      val GIONEE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** MarQ komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
