package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TRECFONE device specifications for Android Compose previews.
 *
 * This extension provides TRECFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trecfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trecfone: Any
  get() = object {
      /** TRECFONE V35 */
      val V35 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
