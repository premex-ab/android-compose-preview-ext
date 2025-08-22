package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HQ device specifications for Android Compose previews.
 *
 * This extension provides HQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hq: Any
  get() = object {
      /** HQ Tablet_HQ_T616 */
      val TABLET_HQ_T616 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
