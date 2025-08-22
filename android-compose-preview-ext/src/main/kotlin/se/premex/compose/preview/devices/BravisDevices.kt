package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * bravis device specifications for Android Compose previews.
 *
 * This extension provides bravis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bravis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bravis: Any
  get() = object {
      /** bravis bravis_A506 */
      val BRAVIS_A506 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bravis ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** bravis NB108 */
      val NB108 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bravis NB753 */
      val NB753 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** bravis NB76 */
      val NB76 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** bravis NB851 */
      val NB851 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bravis NB871 */
      val NB871 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bravis samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
