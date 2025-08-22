package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lunnen device specifications for Android Compose previews.
 *
 * This extension provides Lunnen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lunnen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lunnen: Any
  get() = object {
      /** Lunnen TL42810L01 */
      val TL42810L01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Lunnen TL4648S01 */
      val TL4648S01 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Lunnen TL62810G01 */
      val TL62810G01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Lunnen TL65611S01 */
      val TL65611S01 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** Lunnen TL85611B01 */
      val TL85611B01 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
