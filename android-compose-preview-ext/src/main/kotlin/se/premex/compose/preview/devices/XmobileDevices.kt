package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Xmobile device specifications for Android Compose previews.
 *
 * This extension provides Xmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xmobile: Any
  get() = object {
      /** Xmobile X1 */
      val X1 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Xmobile X7 */
      val X7 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
