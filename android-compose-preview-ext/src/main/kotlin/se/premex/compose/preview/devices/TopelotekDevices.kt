package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TOPELOTEK device specifications for Android Compose previews.
 *
 * This extension provides TOPELOTEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Topelotek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Topelotek: Any
  get() = object {
      /** TOPELOTEK KIDS06 */
      val KIDS06 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOPELOTEK KIDS708_709A */
      val KIDS708_709A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOPELOTEK KIDS709 */
      val KIDS709 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOPELOTEK KIDS720 */
      val KIDS720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOPELOTEK V7 */
      val V7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
