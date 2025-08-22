package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PRIMA device specifications for Android Compose previews.
 *
 * This extension provides PRIMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prima.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prima: Any
  get() = object {
      /** PRIMA kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PRIMA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
