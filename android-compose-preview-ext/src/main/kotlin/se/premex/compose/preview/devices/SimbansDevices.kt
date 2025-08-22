package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Simbans device specifications for Android Compose previews.
 *
 * This extension provides Simbans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Simbans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Simbans: Any
  get() = object {
      /** Simbans PicassoTab */
      val PICASSOTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans PicassoTab8s */
      val PICASSOTAB8S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans PICASSOTABX14 */
      val PICASSOTABX14 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** Simbans PicassoTab_9 */
      val PICASSOTAB_9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans PicassoTab_X */
      val PICASSOTAB_X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans PicassoTab_XL */
      val PICASSOTAB_XL = "spec:width=768,height=1368,unit=px,dpi=160"

      /** Simbans TangoTab */
      val TANGOTAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans TangoTab8 */
      val TANGOTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans TangoTab_364 */
      val TANGOTAB_364 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Simbans TangoTab_X */
      val TANGOTAB_X = "spec:width=800,height=1280,unit=px,dpi=160"

  }
