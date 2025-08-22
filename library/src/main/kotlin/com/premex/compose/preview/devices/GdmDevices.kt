package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GDM device specifications for Android Compose previews.
 *
 * This extension provides GDM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gdm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gdm: Any
  get() = object {
      /** GDM MB10 */
      val MB10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** GDM P4R */
      val P4R = "spec:width=720,height=1520,unit=px,dpi=320"

  }
