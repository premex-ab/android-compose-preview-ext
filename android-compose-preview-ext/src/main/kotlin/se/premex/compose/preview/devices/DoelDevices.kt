package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DOEL device specifications for Android Compose previews.
 *
 * This extension provides DOEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Doel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Doel: Any
  get() = object {
      /** DOEL TT_7_0 */
      val TT_7_0 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
