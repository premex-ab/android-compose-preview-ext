package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUEDIGIT device specifications for Android Compose previews.
 *
 * This extension provides BLUEDIGIT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLUEDIGIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLUEDIGIT: Any
  get() = object {
      /** BLUEDIGIT RAVOZ_R4 */
      val RAVOZ_R4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLUEDIGIT RAVOZ_R7 */
      val RAVOZ_R7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLUEDIGIT RAVOZ_R8 */
      val RAVOZ_R8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** BLUEDIGIT RAVOZ_R9 */
      val RAVOZ_R9 = "spec:width=1080,height=2246,unit=px,dpi=480"

  }
