package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOOYON device specifications for Android Compose previews.
 *
 * This extension provides JOOYON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JOOYON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JOOYON: Any
  get() = object {
      /** JOOYON J110A */
      val J110A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JOOYON sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
