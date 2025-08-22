package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIRZO device specifications for Android Compose previews.
 *
 * This extension provides VIRZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Virzo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Virzo: Any
  get() = object {
      /** VIRZO V511 */
      val V511 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** VIRZO V608_C */
      val V608_C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** VIRZO VT1001 */
      val VT1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VIRZO VT701 */
      val VT701 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
