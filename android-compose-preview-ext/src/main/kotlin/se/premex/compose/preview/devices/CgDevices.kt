package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CG device specifications for Android Compose previews.
 *
 * This extension provides CG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cg: Any
  get() = object {
      /** CG R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CG R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CG R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CG R3_GTV */
      val R3_GTV = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** CG R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
