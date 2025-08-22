package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOME device specifications for Android Compose previews.
 *
 * This extension provides GOME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gome.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gome: Any
  get() = object {
      /** GOME GOME_C7 */
      val GOME_C7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GOME GOME_C7_Note */
      val GOME_C7_NOTE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GOME GOME_C7_Note_Mini */
      val GOME_C7_NOTE_MINI = "spec:width=720,height=1440,unit=px,dpi=320"

  }
