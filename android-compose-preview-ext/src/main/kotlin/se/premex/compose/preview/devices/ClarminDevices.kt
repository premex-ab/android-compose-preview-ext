package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CLARMIN device specifications for Android Compose previews.
 *
 * This extension provides CLARMIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clarmin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clarmin: Any
  get() = object {
      /** CLARMIN CLARMIN_C1 */
      val CLARMIN_C1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
