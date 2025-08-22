package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LiteTEL device specifications for Android Compose previews.
 *
 * This extension provides LiteTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Litetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Litetel: Any
  get() = object {
      /** LiteTEL X20 */
      val X20 = "spec:width=480,height=960,unit=px,dpi=240"

  }
