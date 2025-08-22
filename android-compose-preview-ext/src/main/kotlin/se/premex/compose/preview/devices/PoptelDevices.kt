package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * POPTEL device specifications for Android Compose previews.
 *
 * This extension provides POPTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Poptel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Poptel: Any
  get() = object {
      /** POPTEL P10 */
      val P10 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** POPTEL P60 */
      val P60 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** POPTEL P8 */
      val P8 = "spec:width=480,height=960,unit=px,dpi=240"

      /** POPTEL P9000_MAX */
      val P9000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** POPTEL V9 */
      val V9 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
