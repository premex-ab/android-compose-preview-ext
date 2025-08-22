package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LEOTEC device specifications for Android Compose previews.
 *
 * This extension provides LEOTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Leotec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Leotec: Any
  get() = object {
      /** LEOTEC mid1016_mk_32 */
      val MID1016_MK_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LEOTEC mid1016_mk_64 */
      val MID1016_MK_64 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
