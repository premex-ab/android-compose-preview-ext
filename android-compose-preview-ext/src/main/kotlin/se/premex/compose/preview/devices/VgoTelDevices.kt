package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VGO_TEL device specifications for Android Compose previews.
 *
 * This extension provides VGO_TEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VgoTel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VgoTel: Any
  get() = object {
      /** VGO_TEL Flex_2 */
      val FLEX_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** VGO_TEL NEW_10 */
      val NEW_10 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** VGO_TEL NEW_20 */
      val NEW_20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VGO_TEL NOTE_23 */
      val NOTE_23 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** VGO_TEL Smartphone */
      val SMARTPHONE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** VGO_TEL SMART_8 */
      val SMART_8 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
