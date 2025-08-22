package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iCare device specifications for Android Compose previews.
 *
 * This extension provides iCare device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ICare.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ICare: Any
  get() = object {
      /** iCare iCare10 */
      val ICARE10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
