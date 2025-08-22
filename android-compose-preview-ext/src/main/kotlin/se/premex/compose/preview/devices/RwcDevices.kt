package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RWC device specifications for Android Compose previews.
 *
 * This extension provides RWC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rwc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rwc: Any
  get() = object {
      /** RWC HNPD01 */
      val HNPD01 = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
