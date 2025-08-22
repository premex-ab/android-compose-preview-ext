package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * weelikeit device specifications for Android Compose previews.
 *
 * This extension provides weelikeit device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Weelikeit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Weelikeit: Any
  get() = object {
      /** weelikeit C19W */
      val C19W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit C19W_EEA */
      val C19W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit C28 */
      val C28 = "spec:width=600,height=1024,unit=px,dpi=200"

      /** weelikeit C72W */
      val C72W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** weelikeit C72W_EEA */
      val C72W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** weelikeit C76W */
      val C76W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** weelikeit C76W_EEA */
      val C76W_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** weelikeit C81W */
      val C81W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** weelikeit C81W_EEA */
      val C81W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** weelikeit C85W */
      val C85W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** weelikeit C85W_EEA */
      val C85W_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** weelikeit F11W */
      val F11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit F83W */
      val F83W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit P11W */
      val P11W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit P11W_EEA */
      val P11W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit P16W */
      val P16W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit P16W_EEA */
      val P16W_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** weelikeit P16-W */
      val P16_W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** weelikeit P36W */
      val P36W = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** weelikeit P36W_EEA */
      val P36W_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** weelikeit P39W */
      val P39W = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** weelikeit P39W_EEA */
      val P39W_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** weelikeit P51L_EEA */
      val P51L_EEA = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
