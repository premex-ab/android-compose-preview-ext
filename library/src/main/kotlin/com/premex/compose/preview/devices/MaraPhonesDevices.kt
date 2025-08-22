package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mara_Phones device specifications for Android Compose previews.
 *
 * This extension provides Mara_Phones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MaraPhones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MaraPhones: Any
  get() = object {
      /** Mara_Phones Mara_X1 */
      val MARA_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Mara_Phones Mara_X1_d */
      val MARA_X1_D = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Mara_Phones Mara_Z1 */
      val MARA_Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mara_Phones Mara_Z1_d */
      val MARA_Z1_D = "spec:width=720,height=1600,unit=px,dpi=320"

  }
