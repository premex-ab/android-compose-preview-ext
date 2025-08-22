package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Entity device specifications for Android Compose previews.
 *
 * This extension provides Entity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Entity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Entity: Any
  get() = object {
      /** Entity ENTG1011 */
      val ENTG1011 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Entity HW304_HW291 */
      val HW304_HW291 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
