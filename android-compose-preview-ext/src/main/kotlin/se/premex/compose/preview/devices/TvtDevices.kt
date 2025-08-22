package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TVT device specifications for Android Compose previews.
 *
 * This extension provides TVT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvt: Any
  get() = object {
      /** TVT TVT-T108 */
      val TVT_T108 = "spec:width=1200,height=1920,unit=px,dpi=300"

  }
