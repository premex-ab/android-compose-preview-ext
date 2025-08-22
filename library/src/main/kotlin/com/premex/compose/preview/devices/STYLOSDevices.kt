package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STYLOS device specifications for Android Compose previews.
 *
 * This extension provides STYLOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STYLOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STYLOS: Any
  get() = object {
      /** STYLOS TAB8B */
      val TAB8B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** STYLOS TAB8F */
      val TAB8F = "spec:width=600,height=1024,unit=px,dpi=160"

      /** STYLOS TARISTAB2 */
      val TARISTAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
