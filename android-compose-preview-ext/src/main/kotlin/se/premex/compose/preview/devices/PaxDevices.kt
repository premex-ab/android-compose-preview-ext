package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PAX device specifications for Android Compose previews.
 *
 * This extension provides PAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pax: Any
  get() = object {
      /** PAX A50 */
      val A50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PAX A77 */
      val A77 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PAX PAXM30 */
      val PAXM30 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
